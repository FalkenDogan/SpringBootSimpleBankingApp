package net.javaguides.banking.entity;
/*
 * Entity packagesinin içinde veritabanında oluşturulacak tabloların sınıfları yer alır.
 */
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="accounts")
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "account_holder_name")
	private String accountHolderName;
	private double balance;

}
