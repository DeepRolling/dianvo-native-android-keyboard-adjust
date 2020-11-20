import { NativeModules } from 'react-native';

type DianvoNativeAndroidKeyboardAdjustType = {
  setStateUnspecified(): void;
  setAdjustNothing(): void;
  setAdjustPan(): void;
  setAdjustResize(): void;
  setAdjustUnspecified(): void;
  setAlwaysHidden(): void;
  setAlwaysVisible(): void;
  setVisible(): void;
  setHidden(): void;
  setUnchanged(): void;
};

const { DianvoNativeAndroidKeyboardAdjust } = NativeModules;

export default DianvoNativeAndroidKeyboardAdjust as DianvoNativeAndroidKeyboardAdjustType;
