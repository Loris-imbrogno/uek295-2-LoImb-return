package ch.noseryoung.loimb.domains.returns;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "returns")
public class Returns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "returns_id", nullable = false)
    private Integer id;

    @NotNull
    @Size(min = 2, max = 100)
    @Column(name = "returns_reason", nullable = false)
    @NotBlank(message = "Field must contain a reason")
    private String reason;

    @NotNull
    @Column(name = "returns_amount", nullable = false)
    private double amount;

    @NotNull
    @Column(name = "returns_order_id", nullable = false)
    private int orderId;
}
