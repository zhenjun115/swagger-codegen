package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class AudioFile (
  attributionUrl: Option[String],
  commentCount: Option[Int],
  voteCount: Option[Int],
  fileUrl: Option[String],
  audioType: Option[String],
  id: Option[Long],
  duration: Option[Double],
  attributionText: Option[String],
  createdBy: Option[String],
  description: Option[String],
  createdAt: Option[DateTime],
  voteWeightedAverage: Option[Float],
  voteAverage: Option[Float],
  word: Option[String])
   extends ApiModel


