package za.co.mkhungo.domain;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@NamedQuery(name = "Warehouse.findByStockId", query = "SELECT w FROM Warehouse w WHERE w.stockId = :stockId")
@Table
public class Warehouse {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  private Long stockId;

}
