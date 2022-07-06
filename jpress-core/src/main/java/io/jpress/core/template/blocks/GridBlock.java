package io.jpress.core.template.blocks;

import io.jpress.core.bsformbuilder.BsFormComponent;
import io.jpress.core.template.HtmlBlock;

import java.util.Map;

public class GridBlock extends HtmlBlock {

    public GridBlock() {
        setId("grid");
    }

    @Override
    public void onPrepareRenderData(Map<String, Object> datas) {
        super.onPrepareRenderData(datas);
    }

    @Override
    public String getTemplate() {
        return "<div class=\"\">\n" +
                "  <div class=\"form-group clearfix\">\n" +
                "    <div class=\"row pdlr-15\">\n" +
                "       #for(i = 0; i < (grid  == null ? 2 : grid); i++)" +
                "      <div class=\"col-#(12/grid) bsItemContainer\">#(children?.get(i))</div>\n" +
                "       #end" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n";
    }


    @Override
    public BsFormComponent toBsFormComponent() {
        BsFormComponent component = new BsFormComponent();
        component.setName("栅格");
        component.setTag("grid");
        component.setDragType(DRAG_TYPE_LAYOUT);
        component.setDragIcon("bi bi-grid");
        return component;
    }
}