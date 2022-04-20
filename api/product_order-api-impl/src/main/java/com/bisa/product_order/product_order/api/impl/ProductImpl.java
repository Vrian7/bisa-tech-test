package com.bisa.product_order.product_order.api.impl;

import com.bisa.product_order.api.data.ProductData;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import com.bisa.product_order.api.serv.ProductServ;
import com.bisa.product_order.product_order.api.mapper.ProductMapper;
import com.bisa.product_order.runtime.data.ProductSource;
import com.bisa.product_order.runtime.serv.ProductOrderProvider;
import com.bisa.product_order.tools.error.ErrorException;

import java.util.List;
import javax.ejb.LocalBean;

/**
 *
 * @author brian.barrera
 */
//
@Stateless
@Local(ProductServ.class)
public class ProductImpl implements ProductServ {

    @EJB(name = ProductOrderProvider.NAME)
    private ProductOrderProvider provider;

    @Override
    public ProductData create(ProductData productData) throws ErrorException {
        ErrorException error = new ErrorException("API IMPL");
        error.isNull(productData.getName(), "Producto sin descripcion");
        error.throwException();
        ProductSource productSource = ProductMapper.mapperToProductSource(productData);
        productSource = provider.createProduct(productSource);
        return ProductMapper.mapperToProductData(productSource);
    }

    @Override
    public ProductData edit(ProductData productData) throws ErrorException {
        ErrorException error = new ErrorException("API IMPL");
        error.isNull(productData.getCode(), "Producto no existe");
        error.throwException();
        ProductSource productSource = ProductMapper.mapperToProductSource(productData);
        productSource = provider.updateProduct(productSource);
        return ProductMapper.mapperToProductData(productSource);
    }

    @Override
    public Boolean delete(Long code) throws ErrorException {
        ErrorException error = new ErrorException("API IMPL");
        error.isNull(code, "Producto no existe");
        error.throwException();
        ProductSource productSource = new ProductSource();
        productSource.setProductId(code);
        productSource = provider.createProduct(productSource);
        return true;
    }

    @Override
    public List<ProductData> getList() throws ErrorException {
        List<ProductSource> productSourceList = provider.productList();
        return ProductMapper.mapperToProductDataList(productSourceList);
    }
}
