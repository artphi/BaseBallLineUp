package artphi.bblu.data;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.*;

abstract class XmlManager {

	
		   static Element root = new Element("rooster");
		   static org.jdom2.Document document = new Document(root);

		   public static String save(ArrayList<Player> players, String filename)
		   {
			   for (Player p : players){

				      Element player = new Element("player");
				      root.addContent(player);

				      Attribute name = new Attribute("name",p.getName());
				      Attribute position = new Attribute("name",String.valueOf(p.getPosition()));
				      player.setAttribute(name);
				      player.setAttribute(position);
			   }
		      
			   try
			   {

			      XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());

			      sortie.output(document, new FileOutputStream(filename + ".xml"));
			   }
			   catch (java.io.IOException e){
				   return e.toString();
			   }
			   
			   return "Saved";

		   }
		   
		   public static ArrayList<Player> load(String filename){
			   ArrayList<Player> players = new ArrayList<Player>();
			 //On crée une instance de SAXBuilder
			      SAXBuilder sxb = new SAXBuilder();
			      try
			      {
			         //On crée un nouveau document JDOM avec en argument le fichier XML
			         //Le parsing est terminé ;)
			         document = sxb.build(new File(filename));
			      }
			      catch(Exception e){}

			      //On initialise un nouvel élément racine avec l'élément racine du document.
			      root = document.getRootElement();
			      
			         //On crée une List contenant tous les noeuds "etudiant" de l'Element racine
			         List roosterList = root.getChildren("player");

			         //On crée un Iterator sur notre liste
			         Iterator i = roosterList.iterator();
			         while(i.hasNext())
			         {
			            //On recrée l'Element courant à chaque tour de boucle afin de
			            //pouvoir utiliser les méthodes propres aux Element comme :
			            //sélectionner un nœud fils, modifier du texte, etc...
			            Element current = (Element)i.next();
			            Player p = new Player(current.getAttribute("name").toString(), Integer.parseInt(current.getAttribute("position").toString()));
			            //On affiche le nom de l’élément courant
			            players.add(p);
			         }
			      
			   
			return players;
			   
		   }
		
	
}
