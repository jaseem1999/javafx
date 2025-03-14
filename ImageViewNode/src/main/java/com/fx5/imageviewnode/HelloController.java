package com.fx5.imageviewnode;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HelloController {

    @FXML
    private ImageView myImage;

    @FXML
    private Button dislik;

    @FXML
    private Button api;

    private static final String API_URL = "http://localhost:8201/user/manage/service/get/core-service/city";

    public void dislikeImage(ActionEvent event) {
        Image img = new Image(getClass().getResourceAsStream("dislike.png"));
        myImage.setImage(img);
    }

    @FXML
    public void callApi(ActionEvent event) {
        try {
            // ✅ Create JSON request body
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonBody = objectMapper.writeValueAsString(new CityRequest(100, "kochi"));

            // ✅ Create HTTP client
            HttpClient client = HttpClient.newHttpClient();

            // ✅ Create HTTP request with headers
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .header("Content-Type", "application/json") // 🔹 Important for JSON requests
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                    .build();

            // ✅ Send the request asynchronously
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept(response -> System.out.println("API Response: " + response))
                    .exceptionally(e -> {
                        e.printStackTrace();
                        return null;
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Inner class for JSON request body
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    class CityRequest {
        @JsonProperty("coreServiceId")
        private int coreServiceId;

        @JsonProperty("city")
        private String city;

        public CityRequest() {}

        public CityRequest(int coreServiceId, String city) {
            this.coreServiceId = coreServiceId;
            this.city = city;
        }

        public int getCoreServiceId() { return coreServiceId; }
        public void setCoreServiceId(int coreServiceId) { this.coreServiceId = coreServiceId; }

        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }
    }
}
