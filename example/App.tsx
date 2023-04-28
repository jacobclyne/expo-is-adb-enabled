import { StyleSheet, Text, View } from 'react-native';

import * as ExpoIsAdbEnabled from 'expo-is-adb-enabled';

console.log("heya: ", ExpoIsAdbEnabled.isAdbEnabled)

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Bang</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
