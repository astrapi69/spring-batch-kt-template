package de.alpharogroup.spring.batch.mapper

import org.mapstruct.Mapper

import de.alpharogroup.spring.batch.entity.Bros
import de.alpharogroup.spring.batch.viewmodel.Bro

@Mapper(componentModel = "spring")
interface BrosEntityMapper {

    fun mapToEntity(bro: Bro): Bros

}