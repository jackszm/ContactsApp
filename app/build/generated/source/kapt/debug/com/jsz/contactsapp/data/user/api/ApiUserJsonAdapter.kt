// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.jsz.contactsapp.`data`.user.api

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ApiUserJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ApiUser>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "name", "email", "picture")

  private val apiIdAdapter: JsonAdapter<ApiId> = moshi.adapter(ApiId::class.java, emptySet(), "id")

  private val apiUserNameAdapter: JsonAdapter<ApiUserName> = moshi.adapter(ApiUserName::class.java,
      emptySet(), "name")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "email")

  private val apiUserPictureAdapter: JsonAdapter<ApiUserPicture> =
      moshi.adapter(ApiUserPicture::class.java, emptySet(), "picture")

  public override fun toString(): String = buildString(29) {
      append("GeneratedJsonAdapter(").append("ApiUser").append(')') }

  public override fun fromJson(reader: JsonReader): ApiUser {
    var id: ApiId? = null
    var name: ApiUserName? = null
    var email: String? = null
    var picture: ApiUserPicture? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> id = apiIdAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
        1 -> name = apiUserNameAdapter.fromJson(reader) ?: throw Util.unexpectedNull("name", "name",
            reader)
        2 -> email = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("email", "email",
            reader)
        3 -> picture = apiUserPictureAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("picture", "picture", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ApiUser(
        id = id ?: throw Util.missingProperty("id", "id", reader),
        name = name ?: throw Util.missingProperty("name", "name", reader),
        email = email ?: throw Util.missingProperty("email", "email", reader),
        picture = picture ?: throw Util.missingProperty("picture", "picture", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ApiUser?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    apiIdAdapter.toJson(writer, value_.id)
    writer.name("name")
    apiUserNameAdapter.toJson(writer, value_.name)
    writer.name("email")
    stringAdapter.toJson(writer, value_.email)
    writer.name("picture")
    apiUserPictureAdapter.toJson(writer, value_.picture)
    writer.endObject()
  }
}