/**
 * Copyright (c) 2014, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.server.notification;

import android.app.NotificationChannel;
import android.content.pm.ParceledListSlice;

public interface RankingConfig {

    int getPriority(String packageName, int uid);

    void setPriority(String packageName, int uid, int priority);

    int getVisibilityOverride(String packageName, int uid);

    void setVisibilityOverride(String packageName, int uid, int visibility);

    void setImportance(String packageName, int uid, int importance);

    int getImportance(String packageName, int uid);

    void createNotificationChannel(String pkg, int uid, NotificationChannel channel);
    void updateNotificationChannel(int callingUid, String pkg, int uid, NotificationChannel channel);
    NotificationChannel getNotificationChannel(String pkg, int uid, String channelId);
    void deleteNotificationChannel(String pkg, int uid, String channelId);
    ParceledListSlice<NotificationChannel> getNotificationChannels(String pkg, int uid);
}
