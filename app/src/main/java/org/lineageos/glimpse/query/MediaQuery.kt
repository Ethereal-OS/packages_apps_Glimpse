/*
 * SPDX-FileCopyrightText: 2023 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.glimpse.query

import android.net.Uri
import android.provider.MediaStore

object MediaQuery {
    val MediaStoreFileUri: Uri = MediaStore.Files.getContentUri("external")
    val MediaProjection = arrayOf(
        MediaStore.Files.FileColumns._ID,
        MediaStore.Files.FileColumns.BUCKET_ID,
        MediaStore.Files.FileColumns.DISPLAY_NAME,
        MediaStore.Files.FileColumns.IS_FAVORITE,
        MediaStore.Files.FileColumns.IS_TRASHED,
        MediaStore.Files.FileColumns.MEDIA_TYPE,
        MediaStore.Files.FileColumns.MIME_TYPE,
        MediaStore.Files.FileColumns.DATE_ADDED,
    )
    val AlbumsProjection = arrayOf(
        MediaStore.Files.FileColumns.BUCKET_DISPLAY_NAME,
    ) + MediaProjection
}
