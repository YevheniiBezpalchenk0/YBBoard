package com.yb.board.Mappers;

import com.yb.board.Data.DTO.BoardDTO;
import com.yb.board.Data.Entities.Board;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { BoardColumnMapper.class})
public interface BoardMapper {
    BoardDTO toDTO(Board board);
    Board toEntity(BoardDTO boardDTO);
}
