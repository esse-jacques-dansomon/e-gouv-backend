package me.essejacques.demand.requests;

public record CategoryRequest(
      String name,
      String icon,
      String slug,
      String description,
      Boolean isActive,
      String PublicServiceType) {

}
