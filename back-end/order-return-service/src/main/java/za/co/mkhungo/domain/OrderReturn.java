package za.co.mkhungo.domain;

import jakarta.persistence.*;

import java.util.Date;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table
public class OrderReturn {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "order_id", nullable = false)
  private Long orderId;

  @Column(name = "order_item_id", nullable = false)
  private Long orderItemId;
  @Column(name = "order_return_reason")
  private String orderReturnReason;
  @Column(name = "note")
  private String note ;
  private Date warrantyEndDate;

}
