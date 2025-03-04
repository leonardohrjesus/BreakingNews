package com.course.breakingnews.domain.model.source


import kotlinx.serialization.Serializable

@Serializable
data class SourceDomain(
    val id: String?,
    val name: String?
)