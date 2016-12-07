/* Generated By:JavaCC: Do not edit this line. ParserSBScriptTokenManager.java */
package org.esvux.sbscript.parser;
import org.esvux.sbscript.errores.Errores;
import org.esvux.sbscript.ast.Nodo;
import org.esvux.sbscript.ast.Metodo;
import org.esvux.sbscript.ast.Programa;
import org.esvux.sbscript.ast.FabricaAST;
import org.esvux.sbscript.ast.Constantes;

/** Token Manager. */
public class ParserSBScriptTokenManager implements ParserSBScriptConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x19ffe000000L) != 0L)
         {
            jjmatchedKind = 43;
            return 6;
         }
         if ((active0 & 0x1000000200000L) != 0L)
            return 7;
         return -1;
      case 1:
         if ((active0 & 0x300000000L) != 0L)
            return 6;
         if ((active0 & 0x19cfe000000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 1;
            }
            return 6;
         }
         return -1;
      case 2:
         if ((active0 & 0x6000000L) != 0L)
            return 6;
         if ((active0 & 0x19ef8000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 2;
            return 6;
         }
         return -1;
      case 3:
         if ((active0 & 0x1218000000L) != 0L)
            return 6;
         if ((active0 & 0x18ce0000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 3;
            return 6;
         }
         return -1;
      case 4:
         if ((active0 & 0x8ce0000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 4;
            return 6;
         }
         if ((active0 & 0x10000000000L) != 0L)
            return 6;
         return -1;
      case 5:
         if ((active0 & 0x8ce0000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 5;
            return 6;
         }
         return -1;
      case 6:
         if ((active0 & 0x8c20000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 6;
            return 6;
         }
         if ((active0 & 0xc0000000L) != 0L)
            return 6;
         return -1;
      case 7:
         if ((active0 & 0x8420000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 7;
            return 6;
         }
         if ((active0 & 0x800000000L) != 0L)
            return 6;
         return -1;
      case 8:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 8;
            return 6;
         }
         if ((active0 & 0x8020000000L) != 0L)
            return 6;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 11;
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 37:
         return jjStopAtPos(0, 22);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 40:
         return jjStopAtPos(0, 1);
      case 41:
         return jjStopAtPos(0, 2);
      case 42:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 43:
         jjmatchedKind = 18;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 44:
         return jjStopAtPos(0, 3);
      case 45:
         jjmatchedKind = 19;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 47:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 58:
         return jjStopAtPos(0, 7);
      case 59:
         return jjStopAtPos(0, 24);
      case 60:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 61:
         jjmatchedKind = 4;
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 62:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 94:
         return jjStopAtPos(0, 23);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x840000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x1020000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x704000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x8010000000L);
      case 123:
         return jjStopAtPos(0, 5);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 125:
         return jjStopAtPos(0, 6);
      case 191:
         return jjMoveStringLiteralDfa1_0(0x400L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         break;
      case 43:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         break;
      case 45:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 47:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(1, 48);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         break;
      case 61:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(1, 12);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      case 63:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x11000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8480000000L);
      case 73:
      case 105:
         if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xa00000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x58000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 124:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x30000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x10400000000L);
      case 77:
      case 109:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(2, 25, 6);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 82:
      case 114:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 6);
         return jjMoveStringLiteralDfa3_0(active0, 0x9000000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 6);
         break;
      case 68:
      case 100:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 6);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 76:
      case 108:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 27, 6);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x820000000L);
      case 79:
      case 111:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 6);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x420000000L);
      case 79:
      case 111:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 40, 6);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0xc0000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000000L);
      case 79:
      case 111:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(6, 31, 6);
         break;
      case 80:
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000L);
      case 82:
      case 114:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(6, 30, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x20000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000000000L);
      case 83:
      case 115:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(7, 35, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 76:
      case 108:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(8, 29, 6);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x400000000L);
      case 79:
      case 111:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 39, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(9, 34, 6);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 15;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 34)
                     jjCheckNAddStates(3, 5);
                  break;
               case 1:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 3:
                  if ((0x8000008400000000L & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 4:
                  if (curChar == 34 && kind > 42)
                     kind = 42;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 7:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0xffff7fffffffffffL & l) != 0L && kind > 49)
                     kind = 49;
                  break;
               case 9:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAddStates(0, 2);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(11);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(12, 13);
                  break;
               case 13:
                  if (curChar == 46)
                     jjCheckNAdd(14);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(14);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(6);
                  break;
               case 1:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 2:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x54404610544046L & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 6:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(6);
                  break;
               case 8:
                  if (kind > 49)
                     kind = 49;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 5);
                  break;
               case 8:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 49)
                     kind = 49;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 15 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_3(0x20000000000000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_3(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(1, 53);
         break;
      default :
         return 2;
   }
   return 2;
}
private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 10 && kind > 51)
                     kind = 51;
                  break;
               case 2:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x10000000000000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(1, 52);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   11, 12, 13, 1, 2, 4, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\50", "\51", "\54", "\75", "\173", "\175", "\72", "\174\174", "\46\46", 
"\277\77", "\41", "\75\75", "\41\75", "\76", "\76\75", "\74", "\74\75", "\53", "\55", 
"\52", "\57", "\45", "\136", "\73", null, null, null, null, null, null, null, null, 
null, null, null, null, "\55\55", "\53\53", null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_SINGLE_LINE_COMMENT",
   "IN_FORMAL_COMMENT",
   "IN_MULTI_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 2, 
   3, 0, 0, 0, -1, 
};
static final long[] jjtoToken = {
   0xfffffffffffL, 
};
static final long[] jjtoSkip = {
   0x38f00000000000L, 
};
static final long[] jjtoSpecial = {
   0x38000000000000L, 
};
static final long[] jjtoMore = {
   0x47000000000000L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[15];
private final int[] jjstateSet = new int[30];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public ParserSBScriptTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ParserSBScriptTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 15; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 54)
         {
            jjmatchedKind = 54;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 54)
         {
            jjmatchedKind = 54;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 54)
         {
            jjmatchedKind = 54;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 49 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                    input_stream.backup(1);
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}