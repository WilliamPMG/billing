/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.billing.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



/**
 *
 * @author sotobotero
 */
@Entity
@Data
@Schema(name = "Invoice", description = "Representa el modelo de la base de datos")
public class Invoice {
   @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
   private long id;
   @Schema(name = "customerId", requiredMode = Schema.RequiredMode.REQUIRED, example = "2", defaultValue = "1", description = "Clave Unica para representar al jefe y llamada")
   private long customerId;
   @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED, example = "3", defaultValue = "8", description = "Clave Unica para representar al jefe y llamada")
   private String number;
   @Schema(name = "detail", requiredMode = Schema.RequiredMode.REQUIRED, example = "Esto es el detalle", defaultValue = "1", description = "Clave Unica para representar al jefe y llamada")
   private String detail;
   @Schema(name = "amount", requiredMode = Schema.RequiredMode.REQUIRED, example = "8.25", defaultValue = "8.25", description = "Clave Unica para representar al jefe y llamada")
   private double amount;  
}
