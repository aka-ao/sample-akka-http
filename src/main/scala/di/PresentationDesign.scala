package di

import presentation.{HelloPresentation, RouteRoot}
import wvlet.airframe.newDesign

object PresentationDesign extends PresentationDesign

trait PresentationDesign {

  val design = newDesign
    .bind[HelloPresentation].toSingleton
    .bind[RouteRoot].toSingleton

}
