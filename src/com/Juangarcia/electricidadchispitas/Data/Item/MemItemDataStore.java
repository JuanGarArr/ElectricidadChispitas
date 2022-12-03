package com.Juangarcia.electricidadchispitas.Data.Item;


import com.Juangarcia.electricidadchispitas.Domain.Models.ProductoServicio;

import java.util.List;
import java.util.TreeMap;

//Mem quiere decir de tipo memoria
public class MemItemDataStore implements  ItemDataStore{

        private TreeMap<Object, ProductoServicio> datastore = new TreeMap<Object,ProductoServicio>();


            @Override
            public void saveItem(ProductoServicio productoServicio) {

            }

            @Override
            public void deleteItem(ProductoServicio productoServicio) {

            }

            @Override
            public void updateItem(ProductoServicio productoServicio) {

            }

            @Override
                    public List<ProductoServicio> getAllItems() {
                        return null;
                    }

                    @Override
                        public ProductoServicio findById(Integer Id) {
                            return null;
                        }
                    }

