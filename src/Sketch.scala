package sketch

import scalatags.Text.svgTags.*
import scalatags.Text.svgAttrs.*
import scalatags.Text.implicits.intAttr

def build_object() =
  svg(
    height := 3,
    width := 5,
    order := 2,
    rect(
      x := 1,
      y := 1,
      width := 1,
      height := 1
    )
  ).render
