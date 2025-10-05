package com.yb.board.Mappers;

import com.yb.board.Data.DTO.TicketDTO;
import com.yb.board.Data.Entities.Ticket;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TicketMapper {
    TicketDTO toDTO(Ticket ticket);
    Ticket toEntity(TicketDTO ticketDTO);
}
