package com.blueapps.glpyhconverter.toglyphx.items;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BreakItem extends Item{

    @Override
    public Element getElement(Document doc, String MdC) {
        if (StringUtils.countMatches(MdC, '!') == 2) {
            return doc.createElement("pbr");
        } else {
            return doc.createElement("br");
        }
    }
}
