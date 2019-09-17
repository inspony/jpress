package io.jpress.module.product.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.product.model.base.BaseProduct;

/**
 * Generated by JPress.
 */
@Table(tableName = "product", primaryKey = "id")
public class Product extends BaseProduct<Product> {

    private static final long serialVersionUID = 1L;

    public static final String STATUS_NORMAL = "normal";
    public static final String STATUS_DRAFT = "draft";
    public static final String STATUS_TRASH = "trash";


    public boolean isNormal() {
        return STATUS_NORMAL.equals(getStatus());
    }

    public boolean isDraft() {
        return STATUS_DRAFT.equals(getStatus());
    }

    public boolean isTrash() {
        return STATUS_TRASH.equals(getStatus());
    }

	
}
