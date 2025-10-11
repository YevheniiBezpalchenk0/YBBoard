package com.yb.board.Data.DTO;

import com.yb.board.Data.Entities.TicketStatus;

public record TicketDTO (
        Long id,
        String summary,
        String description,
        String status,
        String assignee
)
{
}
