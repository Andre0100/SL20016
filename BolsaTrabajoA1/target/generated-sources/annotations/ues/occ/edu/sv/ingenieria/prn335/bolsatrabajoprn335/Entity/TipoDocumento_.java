package ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.Documento;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-28T11:06:17", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(TipoDocumento.class)
public class TipoDocumento_ { 

    public static volatile ListAttribute<TipoDocumento, Documento> documentoList;
    public static volatile SingularAttribute<TipoDocumento, String> expresionRegular;
    public static volatile SingularAttribute<TipoDocumento, Integer> idTipoDocumento;
    public static volatile SingularAttribute<TipoDocumento, String> nombre;
    public static volatile SingularAttribute<TipoDocumento, Boolean> activo;

}