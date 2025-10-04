package com.yb.board.Data.DTO;

import com.yb.board.Data.Entities.Board;
import com.yb.board.Data.Entities.BoardColumn;
import com.yb.board.Data.Enums.BOARD_TYPE;

import java.util.List;

public record BoardDTO (
        Long id,
        String name,
        String description,
        BOARD_TYPE type,
        List<BoardColumn> boardColumns
){}
