/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paymentchain.billing.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 *
 * @author DELL G7
 */
@Schema(name = "InvoiceRequest", description = "Modelo que representa en la base")
@Data
public class InvoiceRequest {
    
   @Schema(name = "customer", requiredMode = Schema.RequiredMode.REQUIRED, example = "2", defaultValue = "1", description = "Clave Unica para representar al jefe y llamada")
   private long customer;
   @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED, example = "3", defaultValue = "8", description = "Clave Unica para representar al jefe y llamada")
   private String number;
   @Schema(name = "detail", requiredMode = Schema.RequiredMode.REQUIRED, example = "Esto es el detalle", defaultValue = "1", description = "Clave Unica para representar al jefe y llamada")
   private String detail;
   @Schema(name = "amount", requiredMode = Schema.RequiredMode.REQUIRED, example = "8.25", defaultValue = "8.25", description = "Clave Unica para representar al jefe y llamada")
   private double amount;  
}
