package com.yb.board.Mappers;

import com.yb.board.Data.DTO.TicketDTO;
import com.yb.board.Data.Entities.Ticket;
import com.yb.board.Data.Entities.TicketStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface TicketMapper {
    @Mapping(target = "status", source = "status.name")
    TicketDTO toDTO(Ticket ticket);
    @Mapping(target = "status", ignore = true)
    Ticket toEntity(TicketDTO ticketDTO);

}
