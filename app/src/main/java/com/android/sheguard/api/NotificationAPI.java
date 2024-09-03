package com.android.sheguard.api;

import com.android.sheguard.model.NotificationSenderModel;
import com.android.sheguard.util.NotificationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NotificationAPI {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAtb5rn_4:APA91bHnfbdQ5sevUVqOUoDHUoaZglKa7pba-HWoBwpVKbWLerSciYv2xcxBzgX8uJstNAeyI2IyVbI3JDUIl-XQrjUGc5ObT8o6ljoNVfkqAWb9NnJc9_L1L23FwfBJjlb98BSsf2j6" // Replace with your server key from Firebase Console
            }
    )

    @POST("fcm/send")
    Call<NotificationResponse> sendNotification(@Body NotificationSenderModel body);
}
