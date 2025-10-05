package com.yb.board.Mappers;

import com.yb.board.Data.DTO.BoardColumnDTO;
import com.yb.board.Data.Entities.BoardColumn;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { TicketMapper.class})
public interface BoardColumnMapper {
    BoardColumnDTO toDTO(BoardColumn board);
    BoardColumn toEntity(BoardColumnDTO boardColumnDTO);
}
