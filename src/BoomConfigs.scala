package boom.system

import org.chipsalliance.cde.config.{Config}
// import freechips.rocketchip.config.{Config}
import freechips.rocketchip.system.BaseConfig
import freechips.rocketchip.subsystem.WithCoherentBusTopology

// ---------------------
// BOOM Configs
// ---------------------

class SmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(1) ++                          // small boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class MediumBoomConfig extends Config(
  new boom.common.WithNMediumBooms(1) ++                         // medium boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class LargeBoomConfig extends Config(
  new boom.common.WithNLargeBooms(1) ++                          // large boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class MegaBoomConfig extends Config(
  new boom.common.WithNMegaBooms(1) ++                           // mega boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class GigaBoomConfig extends Config(
  new boom.common.WithNGigaBooms(1) ++                           // giga boom config
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class DualSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(2) ++                          // 2 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class QuadSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(4) ++                          // 4 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class HexaSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(6) ++                          // 6 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class OctaSmallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(8) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _1smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(1) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _2smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(2) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _4smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(4) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _6smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(6) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _8smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(8) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _12smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(12) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _16smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(16) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _24smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(24) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _32smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(32) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

  class _48smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(48) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)


  class _64smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(64) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

  class _80smallBoomConfig extends Config(
  new boom.common.WithNSmallBooms(80) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _96smallBoomConfig extends Config(
  new boom.common.WithCloneBoomTiles(96) ++                          // 8 small boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)


class DualLargeBoomConfig extends Config(
   new boom.common.WithNLargeBooms(2) ++                          // 2 large boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class QuadLargeBoomConfig extends Config(
   new boom.common.WithNLargeBooms(4) ++                          // 4 large boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class HexaLargeBoomConfig extends Config(
   new boom.common.WithNLargeBooms(6) ++                          // 6 large boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class OctaLargeBoomConfig extends Config(
   new boom.common.WithNLargeBooms(8) ++                          // 8 large boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)


class DualMegaBoomConfig extends Config(
   new boom.common.WithNMegaBooms(2) ++                          // 2 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class QuadMegaBoomConfig extends Config(
   new boom.common.WithNMegaBooms(4) ++                          // 4 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)

class HexaMegaBoomConfig extends Config(
   new boom.common.WithNMegaBooms(6) ++                          // 6 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)


class OctaMegaBoomConfig extends Config(
   new boom.common.WithNMegaBooms(8) ++                          // 8 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)


// custom boom configs
class _4megaBoomConfig extends Config(
   new boom.common.WithCloneBoomTiles(3, 0) ++  
   new boom.common.WithNMegaBooms(1) ++                          // 4 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)


class _6megaBoomConfig extends Config(
   new boom.common.WithCloneBoomTiles(5, 0) ++  
   new boom.common.WithNMegaBooms(1) ++                          // 4 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)


class _8megaBoomConfig extends Config(
   new boom.common.WithCloneBoomTiles(7, 0) ++  
   new boom.common.WithNMegaBooms(1) ++                          // 4 mega boom cores
   new WithCoherentBusTopology ++
   new freechips.rocketchip.system.BaseConfig)


class _16megaBoomConfig extends Config(
  new boom.common.WithCloneBoomTiles(15, 0) ++
  new boom.common.WithNMegaBooms(1) ++                          // 4 mega boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _24megaBoomConfig extends Config(
  new boom.common.WithCloneBoomTiles(23, 0) ++
  new boom.common.WithNMegaBooms(1) ++                          // 4 mega boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _32megaBoomConfig extends Config(
  new boom.common.WithCloneBoomTiles(31, 0) ++
  new boom.common.WithNMegaBooms(1) ++                          // 4 mega boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _40megaBoomConfig extends Config(
  new boom.common.WithCloneBoomTiles(39, 0) ++
  new boom.common.WithNMegaBooms(1) ++                          // 4 mega boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _48megaBoomConfig extends Config(
  new boom.common.WithCloneBoomTiles(47, 0) ++
  new boom.common.WithNMegaBooms(1) ++                          // 4 mega boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class _96megaBoomConfig extends Config(
  new boom.common.WithCloneBoomTiles(95, 0) ++
  new boom.common.WithNMegaBooms(1) ++                          // 4 mega boom cores
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

// class _96megaBoomConfig extends Config(
//   new boom.common.WithNMegaBooms(96) ++                          // 4 mega boom cores
//   new WithCoherentBusTopology ++
//   new freechips.rocketchip.system.BaseConfig)



class DualGigaBoomConfig extends Config(
  new boom.common.WithNGigaBooms(2) ++                           // 2 giga boom
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class QuadGigaBoomConfig extends Config(
  new boom.common.WithNGigaBooms(4) ++                           // 4 giga boom
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)

class HexaGigaBoomConfig extends Config(
  new boom.common.WithNGigaBooms(6) ++                           // 6 giga boom
  new WithCoherentBusTopology ++
  new freechips.rocketchip.system.BaseConfig)
