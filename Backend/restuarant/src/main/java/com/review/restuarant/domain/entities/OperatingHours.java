package com.review.restuarant.domain.entities;

import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OperatingHours {

    @Field(type = FieldType.Nested)
    private TimeRange monday; // TimeRange for Monday

    @Field(type = FieldType.Nested)
    private TimeRange tuesday; // TimeRange for Tuesday

    @Field(type = FieldType.Nested)
    private TimeRange wednesday; // TimeRange for Wednesday

    @Field(type = FieldType.Nested)
    private TimeRange thursday; // TimeRange for Thursday

    @Field(type = FieldType.Nested)
    private TimeRange friday; // TimeRange for Friday

    @Field(type = FieldType.Nested)
    private TimeRange saturday; // TimeRange for Saturday

    @Field(type = FieldType.Nested)
    private TimeRange sunday; // TimeRange for Sunday
}
