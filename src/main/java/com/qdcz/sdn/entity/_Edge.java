package com.qdcz.sdn.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

/**
 * Created by hadoop on 17-6-22.
 */
@Data
@RelationshipEntity(type="gra")
public class _Edge extends Edge{
    public _Edge(){
        super();
    }
    @JsonCreator
    public _Edge(@JsonProperty("relation") String relation,
                @JsonProperty("from") Vertex from,
                @JsonProperty("to") Vertex to) {
        super(relation,from,to);

    }
    @JsonCreator
    public _Edge(@JsonProperty("relation") String relation,
                @JsonProperty("from") Vertex from,
                @JsonProperty("to") Vertex to,
                @JsonProperty("root") String root) {
        super(relation,from,to,root);
    }

    @Relationship(type = "gra", direction=Relationship.OUTGOING)
    public String relation;
}
