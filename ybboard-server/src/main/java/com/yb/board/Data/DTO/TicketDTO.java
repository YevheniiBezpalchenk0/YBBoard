package com.yb.board.Data.DTO;

public record TicketDTO (
        Long id,
        String summary,
        String description,
        String status,
        String assignee
)
{
}
