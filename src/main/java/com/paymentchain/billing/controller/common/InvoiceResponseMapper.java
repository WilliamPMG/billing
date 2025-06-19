/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.paymentchain.billing.controller.common;

import com.paymentchain.billing.dto.InvoiceRequest;
import com.paymentchain.billing.dto.InvoiceResponse;
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
public interface InvoiceResponseMapper {
    @Mappings({
        @Mapping(source = "customerId", target = "customer"), 
        @Mapping(source = "id", target = "invoiceId")
    })
    InvoiceResponse InvoiceToInvoiceResponse(Invoice source);
    
    //No se vuelve a colocar los mappings por que asume que es lom mismo que el anterior 
    List<InvoiceResponse> InvoiceListToInvoiceResponceList(List<Invoice> source);
    
    @InheritInverseConfiguration
    Invoice InvoiceResponseToInvoice(InvoiceResponse source);
    
    @InheritInverseConfiguration
    List<Invoice> InvoiceResponseListToInvoiceList(List<InvoiceResponse> source);
}
