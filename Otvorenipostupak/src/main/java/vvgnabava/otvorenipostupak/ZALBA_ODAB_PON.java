package vvgnabava.otvorenipostupak;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ZALBA_ODAB_PON")
public class ZALBA_ODAB_PON implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "id_zalba_oda_pon")
   private java.lang.Integer id_zalba_oda_pon;
   @org.kie.api.definition.type.Label(value = "broj_odl_odabir")
   private java.lang.String broj_odl_odabir;
   @org.kie.api.definition.type.Label(value = "datum")
   private java.util.Date datum;

   public ZALBA_ODAB_PON()
   {
   }

   public java.lang.Integer getId_zalba_oda_pon()
   {
      return this.id_zalba_oda_pon;
   }

   public void setId_zalba_oda_pon(java.lang.Integer id_zalba_oda_pon)
   {
      this.id_zalba_oda_pon = id_zalba_oda_pon;
   }

   public java.lang.String getBroj_odl_odabir()
   {
      return this.broj_odl_odabir;
   }

   public void setBroj_odl_odabir(java.lang.String broj_odl_odabir)
   {
      this.broj_odl_odabir = broj_odl_odabir;
   }

   public java.util.Date getDatum()
   {
      return this.datum;
   }

   public void setDatum(java.util.Date datum)
   {
      this.datum = datum;
   }

   public ZALBA_ODAB_PON(java.lang.Integer id_zalba_oda_pon,
         java.lang.String broj_odl_odabir, java.util.Date datum)
   {
      this.id_zalba_oda_pon = id_zalba_oda_pon;
      this.broj_odl_odabir = broj_odl_odabir;
      this.datum = datum;
   }

}