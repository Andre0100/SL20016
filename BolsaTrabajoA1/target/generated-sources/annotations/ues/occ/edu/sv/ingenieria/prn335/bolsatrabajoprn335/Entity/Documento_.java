package ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.DocumentoPK;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.Persona;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.TipoDocumento;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-28T11:06:17", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Documento.class)
public class Documento_ { 

    public static volatile SingularAttribute<Documento, TipoDocumento> tipoDocumento;
    public static volatile SingularAttribute<Documento, Date> fechaModificacion;
    public static volatile SingularAttribute<Documento, Persona> persona;
    public static volatile SingularAttribute<Documento, String> valor;
    public static volatile SingularAttribute<Documento, DocumentoPK> documentoPK;

}