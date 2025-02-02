package com.alpharays.medico.domain.repository

import com.alpharays.alaskagemsdk.network.ResponseResult
import com.alpharays.medico.domain.model.homescreen.currappointment.Appointment
import com.alpharays.medico.domain.model.homescreen.currappointment.AppointmentDetailsResponse

interface HomeRepository {
    suspend fun getAppointmentList(token: String): ResponseResult<AppointmentDetailsResponse>
    suspend fun addNewAppointment(docId: String, newAppointment: Appointment): ResponseResult<Any>
}