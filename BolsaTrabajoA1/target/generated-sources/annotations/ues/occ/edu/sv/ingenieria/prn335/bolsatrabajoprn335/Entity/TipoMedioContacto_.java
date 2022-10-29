package ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ues.occ.edu.sv.ingenieria.prn335.bolsatrabajoprn335.Entity.MedioContacto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-28T11:06:17", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(TipoMedioContacto.class)
public class TipoMedioContacto_ { 

    public static volatile SingularAttribute<TipoMedioContacto, Integer> idTipoMedioContacto;
    public static volatile SingularAttribute<TipoMedioContacto, String> nombreVisible;
    public static volatile SingularAttribute<TipoMedioContacto, String> expresionRegular;
    public static volatile SingularAttribute<TipoMedioContacto, String> indicacionesLlenado;
    public static volatile ListAttribute<TipoMedioContacto, MedioContacto> medioContactoList;
    public static volatile SingularAttribute<TipoMedioContacto, String> nombre;

}