/*
 * Copyright (c) 2018 Nam Nguyen, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.ene.toro.exoplayer;

import android.support.annotation.NonNull;
import im.ene.toro.ToroPlayer;
import im.ene.toro.media.VolumeInfo;

/**
 * General definition of a component that wishes to control the {@link VolumeInfo}.
 */
public interface VolumeInfoController {

  void addOnVolumeChangeListener(@NonNull ToroPlayer.OnVolumeChangeListener listener);

  void removeOnVolumeChangeListener(ToroPlayer.OnVolumeChangeListener listener);

  void clearOnVolumeChangeListener();

  boolean setVolumeInfo(@NonNull VolumeInfo volumeInfo);

  VolumeInfo getVolumeInfo();
}