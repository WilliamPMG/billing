/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paymentchain.billing.common;

import com.paymentchain.billing.dto.InvoiceRequest;
import com.paymentchain.billing.entities.Invoice;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


/**
 *
 * @author DELL G7
 */
@Mapper(componentModel = "spring")
public interface InvoiceRequestMapper {
    
    @Mappings({@Mapping(source = "customer", target = "customerId")})
    Invoice InvoiceRequestToInvoice(InvoiceRequest source);
    
    //No se vuelve a colocar los mappings por que asume que es lom mismo que el anterior 
    List<Invoice> InvoiceRequestListToInvoiceList(List<InvoiceRequest> source);
    
    @InheritInverseConfiguration
    InvoiceRequest InvoiceToInvoiceRequest(Invoice source);
    
    @InheritInverseConfiguration
    List<InvoiceRequest> InvoiceListToInvoiceRequestList(List<Invoice> source);
}
