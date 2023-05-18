import ExpoIsAdbEnabledModule from "./ExpoIsAdbEnabledModule";
import { Platform } from "react-native";

export const isAdbEnabled: boolean = Platform.OS == "android" ? ExpoIsAdbEnabledModule.isAdbEnabled() : false ;
