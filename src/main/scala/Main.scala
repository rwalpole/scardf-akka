/**
 * Created with IntelliJ IDEA.
 * User: rob
 * Date: 18/07/13
 * Time: 20:17
 * To change this template use File | Settings | File Templates.
 */

package dojo

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object Main extends App {
   val actorSystem = ActorSystem("rdfActorSystem")

  actorSystem.actorOf(Props(new Writer())) ! WriteMessage("John", "Smith", "http://www.bbc.co.uk")
}
