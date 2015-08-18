package de.mpi.dataexchange;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by matthiaspiehl on 30.05.15.
 */
public class ExtraMapDeserializer extends JsonDeserializer<ExtraMap> {

    @Override
    public ExtraMap deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        ExtraMap result = new ExtraMap();
        JsonNode node = jp.getCodec().readTree(jp);
        //jp.nextToken().name(); 
      /*  JsonNode node =
                readTree(jp)
                ;

        Iterator<String> fieldNames = node.getFieldNames();
        while(fieldNames.hasNext()){
*/
        int i = 0;
        Iterator<JsonNode> elements = node.elements();
        while (elements.hasNext()) {
            JsonNode next = elements.next();
            System.out.println(next.textValue());
            result.put("element" + i++, next.textValue() + "_value");
      /*  node.
        int id = (Integer) ((IntNode) node.get("id")).numberValue();
        String itemName = node.get("itemName").asText();
        int userId = (Integer) ((IntNode) node.get("createdBy")).numberValue();
*/

        }
        return result;

    }
}
