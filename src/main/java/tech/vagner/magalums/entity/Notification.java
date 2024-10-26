package tech.vagner.magalums.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_notifications")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long notificationId;
	
	private LocalDateTime dateTime;
	private String destination;
	private String message;
	
}
