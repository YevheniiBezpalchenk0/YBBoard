package com.yb.board.Mappers;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { TicketMapper.class})
public interface ColumnMapper {
}
