import ExpoIsAdbEnabledModule from "./ExpoIsAdbEnabledModule";

export function isAdbEnabled(): string {
  return ExpoIsAdbEnabledModule.isAdbEnabled();
}

export function dangerous(): boolean {
  return ExpoIsAdbEnabledModule.dangerous();
}