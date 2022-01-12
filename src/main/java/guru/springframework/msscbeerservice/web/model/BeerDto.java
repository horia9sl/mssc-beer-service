package guru.springframework.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.ApplicationRunner;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by a001054 on 12.01.22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String beerName;
    private BeerStyleEnum beerStyle;

    private Long upc;

    private BigDecimal price;
    private Integer quantityOnHand;



}
