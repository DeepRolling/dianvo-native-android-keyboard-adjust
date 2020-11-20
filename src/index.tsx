import { NativeModules } from 'react-native';

type DianvoNativeAndroidKeyboardAdjustType = {
  multiply(a: number, b: number): Promise<number>;
};

const { DianvoNativeAndroidKeyboardAdjust } = NativeModules;

export default DianvoNativeAndroidKeyboardAdjust as DianvoNativeAndroidKeyboardAdjustType;
