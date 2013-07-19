package dojo

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import org.scardf._

/**
 * Created with IntelliJ IDEA.
 * User: rob
 * Date: 18/07/13
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */
class Writer extends Actor {
 def receive = {
   case WriteMessage(firstName, lastName, url) =>

     val rdf = Graph( UriRef(url) -(
       UriRef("http://dojo#firstName") -> firstName,
       UriRef("http://dojo#lastName") -> lastName
    ) )

     println(rdf.rend)

 }
}


case class WriteMessage(firstName: String, lastName: String, URL: String)               ±±