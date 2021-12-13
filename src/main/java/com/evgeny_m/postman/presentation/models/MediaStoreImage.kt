package com.evgeny_m.postman.presentation.models

import android.net.Uri
import java.util.*

data class MediaStoreImage(
    val id: Long,
    val displayName: String,
    val dateAdded: Date,
    val contentUri: Uri
)